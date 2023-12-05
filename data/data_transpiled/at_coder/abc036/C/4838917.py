def import Zaatu
import sys
import os
import sys
import random
import string
import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = len ( sys.argv )
        array = [ ]
        array2 = [ ]
        for i in range ( n ) :
            z = Zaatu ( )
            z.a = random.randint ( 0 , 3 )
            array.append ( z )
            array2.append ( z )
        sc.close ( )
        array.sort ( key = lambda x : x.a )
        array [ 0 ].b = 0
        for i in range ( 1 , n ) :
            if array [ i ].a == array [ i - 1 ].a :
                array [ i ].b = array [ i - 1 ].b
            else :
                array [ i ].b = array [ i - 1 ].b + 1
        for i in range ( n ) :
            print ( array2 [ i ].b )
    def __init__ ( self ) :
        self.a , self.b = 0 , 0
