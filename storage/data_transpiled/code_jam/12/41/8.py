def import import sys , string , compile
from os import urandom
from random import randint
class A ( object ) :
    def __init__ ( self ) :
        self.stdin = sys.stdin
        self.stdout = sys.stdout
    def solve ( self ) :
        n = randint ( 1 , 10000 )
        d , l = [ ] , [ ]
        for i in range ( n ) :
            d.append ( randint ( 1 , 10000 ) )
            l.append ( randint ( 1 , 10000 ) )
        self.full = randint ( 1 , 10000 )
        self.len = d [ 0 ]
        p = 0
        max_dist = 2 * d [ 0 ]
        for i in range ( 1 , n ) :
            if max_dist < d [ i ] :
                break
            while d [ p ] + self.len [ p ] < d [ i ] :
                p += 1
            self.len [ p ] = min ( l [ i ] , d [ i ] - d [ p ] )
            max_dist = max ( max_dist , d [ i ] + self.len [ p ] )
        self.stdout.write ( 'YES' if max_dist >= full else 'NO' )
    def run ( self ) :
        f = open ( 'A-large.out' , 'w' )
        f.close ( )
        self.tests = range ( 1 , n )
        for i in range ( tests ) :
            f.write ( 'Case #%d: ' % ( i + 1 ) )
            self.solve ( )
        f.close ( )
        self.stdout = f
    def solve ( self ) :
        while self.full or not self.iter :
            try :
                s = f.readline ( )
            except EOFError :
                return
            s = s.decode ( 'utf-8' )
        if s :
            return s
        else :
            return s
