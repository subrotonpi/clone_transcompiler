def import _gen_a_q14
import os
import sys
import os
import sys
import sys
import os
import sys
import sys
class MagicTrick_A_Q14 ( object ) :
    PROBLEM_NAME = 'A-small-attempt0'
    INPUT_PATH = '{}.in'.format ( PROBLEM_NAME )
    OUTPUT_PATH = '{}-Output.txt'.format ( PROBLEM_NAME )
    def __init__ ( self , layout ) :
        self.layout_1 = [ ]
        self.answer_1 = 0
        self.layout_2 = [ ]
        self.answer_2 = 0
    def solve ( ) :
        possible1 = set ( [ ] )
        possible2 = set ( [ ] )
        for i in range ( self.layout_1 [ self.answer_1 - 1 ] ) :
            possible1.add ( i )
        for i in range ( self.layout_2 [ self.answer_2 - 1 ] ) :
            possible2.add ( i )
        possible1.retainAll ( possible2 )
        if len ( possible1 ) == 0 :
            return 'Volunteer cheated!'
        elif len ( possible1 ) == 1 :
            return str ( possible1.pop ( ) )
        else :
            return 'Bad magician!'
    def main ( ) :
        with open ( INPUT_PATH , 'r' ) as in_file , open ( OUTPUT_PATH , 'w' ) as out_file :
            t = sys.argv [ 1 ]
            for i in range ( 1 , t + 1 ) :
                print ( 'Case #{}: '.format ( i ) )
                out_file.write ( MagicTrick_A_Q14 ( in_file ).solve ( ) )
                out_file.write ( '\n' )
                out_file.flush ( )
