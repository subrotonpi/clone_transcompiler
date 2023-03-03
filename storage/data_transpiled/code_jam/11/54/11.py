def _import ( ) :
    import os
    import sys
    import time
    import math
    import random
    import time
    class Sol ( object ) :
        ans = - 1
        def go ( self , c , i ) :
            if i == len ( c ) :
                x = int ( raw_input ( c ) , 2 )
            else :
                x = int ( raw_input ( c ) )
            if self.test_number == 2 :
                debug ( x )
            r = round ( sqrt ( x ) )
            if r ** 2 == x or ( r + 1 ) ** 2 == x or ( r - 1 ) ** 2 == x :
                ans = x
            return
        if c [ i ] == '?' :
            c [ i ] = '0'
            go ( c , i + 1 )
            c [ i ] = '1'
            go ( c , i + 1 )
            c [ i ] = '?'
        else :
            go ( c , i + 1 )
    def solve ( ) :
        c = stdin.readline ( ).decode ( 'ascii' )
        go ( c , 0 )
        out.write ( 'Case #%d: %s\n' % ( self.test_number + 1 , int ( ans ) ) )
    def main ( ) :
        with open ( 'sol' , 'r' ) as f :
            try :
                locale.setlocale ( locale.LC_ALL , '' )
                f.seek ( 0 )
                f.write ( '\n' )
                sTime ( )
                T = randint ( 1 , 100 )
                for testNumber in range ( T ) :
                    solve ( )
                    debug ( 'Test %d finished at time: %s' % ( testNumber , gTime ( ) ) )
                f.close ( )
            except :
                print ( 'exception at test = %d' % testNumber )
                sys.exit ( 1 )
    lex = [ ]
    if lex :
        lex.append ( lex )
    lex.sort ( )
    return lex
