def import _main
import sys
import random
class Main ( object ) :
    def __init__ ( self ) :
        self.n = len ( sys.argv )
        self.list = [ ]
        self.dist = [ 0 ] * ( n + 1 )
        for i in range ( 0 , n + 1 ) :
            self.list.append ( [ ] )
        for i in range ( n - 1 ) :
            a , b , c = random.randint ( 0 , n )
            self.list [ a ].append ( ( b , c ) )
            self.dist [ b ].append ( ( a , c ) )
    def q ( self ) :
        self.k = random.randint ( 0 , n )
        self.dfs ( k , 0 , - 1 )
        for i in self.list [ : q ] :
            print ( self.dist [ x ] + self.dist [ y ] )
