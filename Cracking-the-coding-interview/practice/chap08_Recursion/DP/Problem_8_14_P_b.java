package chap08_Recursion.DP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * (11.04.2019).
 * 
 * Boolean Evaluation: Given a boolean expression consisting of the symbols 0
 * (false), 1 (true), & (AND), | (OR), and ^ (XOR) and a desired boolean
 * result value result, implement a function to count the number of ways of
 * parenthesizing the expression such that it evaluates to result.
 * 
 * EXAMPLE 
 * countEval("1^0|0|1", false) -> 2 
 * countEval("0&0&0&1^1|0", true) -> 10
 * 
 * (Extremely difficult and challenging) - Phew. 
 * 
 * (DEPENDENCY) -> CHAPTER 5 - Bitwise Operations. 
 */
public class Problem_8_14_P_b
{
   public static void main(String[] args)
   {
      String booleanExpression = "1^0|0|1";
      
      printList(generateBooleanExpressions(booleanExpression));
   }
   
   public static void printList(ArrayList<String> list)
   {
      String output = ""; 
      
      for(int i = 0; i<list.size(); i++ )
      {
         output += i + "." + list.get(i) + "\n"; 
      }
      
      System.out.println(output);
   }
   
   public static ArrayList<String> generateBooleanExpressions(String booleanExpression)
   {
      // For every boolean expression operand operator operand. (or) operand operator... 
      ArrayList<String> allValidBooleanExpression = new ArrayList<String>(); 
      char[] generatedExpression = new char[booleanExpression.length()]; 
      
      // Retrieve Operators.
      HashSet<Character> validOperators = new HashSet<Character>(); 
      validOperators.add('^'); 
      validOperators.add('|'); 
      HashMap<Character, Integer> operators = retrieveOperators(booleanExpression, validOperators);  
      
      // Retrieve Operands. 
      HashMap<Character, Integer> operands = retrieveOperands(booleanExpression);  
      
      generateBooleanExpression( operands, operators, allValidBooleanExpression, booleanExpression.length(), generatedExpression, 0 );
      
      return allValidBooleanExpression; 
   }
   
   public static void generateBooleanExpression( HashMap<Character, Integer> operands, HashMap<Character, Integer> operators, 
                                                 ArrayList<String> allValidBooleanExpression, 
                                                 int maxLen, char[] generatedExpression, int index )
   {
      if( index == 0 )
      {
         for(Character c : operands.keySet())
         {
            if(operands.get(c) == 0)
               continue; 
            
            generatedExpression[index] = c;
            operands.put(c, operands.get(c) - 1); 
            generateBooleanExpression(operands, operators, allValidBooleanExpression, maxLen, generatedExpression, index + 1);
            
            // State Restoration. 
            generatedExpression[index] = 0; 
            operands.put(c,  operands.get(c) + 1); 
         }
      }
      else if( index == maxLen )
      {
         allValidBooleanExpression.add( String.copyValueOf(generatedExpression) ); 
      }
      else 
      {
         // If it is an operator - Append an operand. 
         if( isOperator( generatedExpression[index - 1], operators.keySet() ) )
         {
            for(Character c : operands.keySet())
            {
               if(operands.get(c) == 0)
                  continue; 
               
               generatedExpression[index] = c; 
               operands.put(c, operands.get(c) - 1); 
               generateBooleanExpression(operands, operators, allValidBooleanExpression, maxLen, generatedExpression, index + 1);
               
               // State Restoration. 
               generatedExpression[index] = 0; 
               operands.put(c,  operands.get(c) + 1); 
            }
         }
         else
         {
            // If it is an operand - Append an operator. 
            for(Character c : operators.keySet())
            {
               if(operators.get(c) == 0)
                  continue; 
               
               generatedExpression[index] = c; 
               operators.put(c, operators.get(c) - 1); 
               generateBooleanExpression(operands, operators, allValidBooleanExpression, maxLen, generatedExpression, index + 1);
               
               // State Restoration. 
               generatedExpression[index] = 0; 
               operators.put(c,  operators.get(c) + 1); 
            }
         }
      }
   }
   
   public static boolean isOperator( char c, Set<Character> operator )
   {
      Character cB = c; 
      return operator.contains(cB); 
   }
   
   private static HashMap<Character, Integer> retrieveOperators( String booleanExpression, HashSet<Character> validOperators )
   {
      HashMap<Character, Integer> hmap = new HashMap<Character, Integer>(); 
      
      for(int i=0; i<booleanExpression.length(); i++)
      {
         Character currentCharacter = booleanExpression.charAt(i); 
         
         if(validOperators.contains(currentCharacter))
         {
            if(hmap.containsKey(currentCharacter))
            {
               hmap.put(currentCharacter, hmap.get(currentCharacter) + 1); 
            }
            else
            {
               hmap.put(currentCharacter, 1); 
            }
         }
      }
      
      return hmap; 
   }
   
   
   private static HashMap<Character, Integer> retrieveOperands( String booleanExpression )
   {
      HashSet<Character> validOperands = new HashSet<Character>(); 
      validOperands.add('0'); 
      validOperands.add('1');
      
      HashMap<Character, Integer> hmap = new HashMap<Character, Integer>(); 
      
      for( int i=0; i<booleanExpression.length(); i++ )
      {
         Character currentCharacter = booleanExpression.charAt(i); 
         
         if( validOperands.contains(currentCharacter) )
         {
            if(hmap.containsKey(currentCharacter))
            {
               hmap.put(currentCharacter, hmap.get(currentCharacter) + 1); 
            }
            else
            {
               hmap.put(currentCharacter, 1); 
            }
         }
      }
      
      return hmap; 
   }
   
   private static void printMap( HashMap<Character, Integer> hmap )
   {
      String output = ""; 
      
      for(Character c : hmap.keySet())
      {
         output += c + " : " + hmap.get(c) + "\n"; 
      }
      
      System.out.println(output); 
   }
}
