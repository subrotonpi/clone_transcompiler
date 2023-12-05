def _ _ init _ _ ( ) : return sys.argv [ 1 ]
import os
import random
import sys
class GCJ_A :
    def __init__ ( self ) :
        self.FILENAME = 'A-large'
        self.stdin = open ( self.FILENAME )
        self.stdout = open ( self.FILENAME , 'w' )
        self.st = [ random.randint ( 0 , 1000 ) for i in range ( self.st [ 0 ] ) ]
        self.st_int = int ( self.st [ 0 ] )
        self.readInt = int ( self.stdin.readline ( ) )
    def pprint ( self , x ) :
        print ( x , end = self.FILENAME )
    def print ( self , x ) :
        print ( x , end = self.FILENAME )
    def print ( self , x ) :
        print ( x , end = self.FILENAME )
    def print ( self , x ) :
        print ( x , end = self.FILENAME )
    def main ( self ) :
        f = open ( self.FILENAME + '.in' , 'r' )
        f.write ( '' )
        f.close ( )
        f = open ( self.FILENAME + '.out' , 'w' )
        self.T = self.readInt ( )
        for i in range ( 1 , T + 1 ) :
            print ( 'Case #%d: ' % i , end = self.N )
            solve ( )
        f.close ( )
        f.close ( )
    def solve ( self ) :
        n = self.readInt ( )
        if n == 0 :
            print ( 'INSOMNIA' )
            return
        g = 0
        ts = [ False ] * 10
        m = 0
        while g < 10 :
            m += n
            k = m
            while k > 0 :
                d = int ( k % 10 )
                if not ts [ d ] :
                    ts [ d ] = True
                    g += 1
                k //= 10
        print ( m , end = self.N )
