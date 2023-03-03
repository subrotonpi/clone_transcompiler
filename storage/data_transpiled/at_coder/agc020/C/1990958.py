def import import os , errno
from os import urandom
from random import randint
class Main ( object ) :
    def __init__ ( self ) :
        with open ( os , 'r' ) as f :
            n = int ( f.read ( ) )
            a = [ ]
            s = 0
            for i in range ( n ) :
                a.append ( randint ( 0 , s ) )
                s += a [ i ]
            can = 1
            for i in range ( n ) :
                can = can.shift ( a [ i ] ) | can
            for i in range ( ( s + 1 ) // 2 , s + 1 ) :
                if can.testBit ( i ) :
                    print ( i )
                    return
    def tr ( self , * args ) :
        print ( " ".join ( args ) )
    def main ( self ) :
        with open ( os , 'w' ) as f :
            f.write ( "\n" )
