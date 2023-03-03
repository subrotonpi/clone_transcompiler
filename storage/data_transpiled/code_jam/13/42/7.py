def import import sys
import os
import getopt
class Main ( object ) :
    def __init__ ( self ) :
        self.out = sys.stdout
    def __init__ ( self , text ) :
        self.text = text
        self.tests = int ( self.text )
        for test in range ( 1 , tests + 1 ) :
            texts = self.text.split ( )
            n = int ( texts [ 0 ] )
            p = long ( texts [ 1 ] )
            place = 1 << n
            t = 0
            while place > p :
                place >>= 1
                t += 1
            answ2 = ( 1 << n ) - ( 1 << t )
            t = 1
            place = ( 1 << n ) - p
            for i in range ( n - 1 , - 1 , - 1 ) :
                if ( ( 1 << i ) & place ) == 0 :
                    t += 1
                else :
                    break
            answ1 = min ( ( 1 << t ) - 2 , ( 1 << n ) - 1 )
            print ( "Case #%d: " % test , end = ' ' )
            print ( answ1 , answ2 )
