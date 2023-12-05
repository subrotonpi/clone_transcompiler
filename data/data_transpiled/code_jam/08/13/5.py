def import os , sys
import string
import os
import sys
import random
class Main ( object ) :
    def __init__ ( self ) :
        self.FNAME = "c1"
    def open ( self , f ) :
        self.FNAME = f.name
    def open ( self , f ) :
        self.FNAME = f.name
    def run ( self ) :
        two = random.randint ( 2 , 3 )
        l = random.randint ( 2 , 3 ) * random.randint ( 2 , 3 )
        r = random.randint ( 3 , 4 ) * random.randint ( 2 , 3 )
        p = random.randint ( 5 , 6 ) * random.randint ( 2 , 3 )
        while not r :
            m = l + r / two
            if m * m > p :
                r = m
            else :
                l = m + 1
        l = l + random.randint ( 3 , 4 )
        tn = len ( self.FNAME )
        for test in range ( 1 , tn + 1 ) :
            d = random.randint ( 2 , 3 )
            s = "%.2f" % ( l * d / ( d * 35 ) ) % ( "1000" * ( 3 - len ( s ) ) )
            while len ( s ) < 3 :
                s = '0' + s
            print ( "Case #%d: %s" % ( test , s ) , file = sys.stderr )
