def import import sys , random
from os import urandom
from random import seed
class A ( object ) :
    def __init__ ( self ) :
        self.__init__ ( )
    def run ( self ) :
        self.stdin = open ( FNAME + '.in' , 'r' )
        self.stdout = open ( FNAME + '.out' , 'w' )
        self.solve ( )
        self.stdout.close ( )
    def readline ( self ) :
        while not self.stdin or not self.stdout :
            try :
                self.stdin = open ( FNAME + '.in' , 'r' )
            except :
                self.stdin = sys.stdin
                self.stdout = sys.stdout
        return self.stdin.readline ( )
    def randint ( self ) :
        return int ( self.stdin.readline ( ) )
    def long ( self ) :
        return long ( self.stdin.readline ( ) )
    def uniform ( self ) :
        return uniform ( )
    FNAME = 'a'
    def solve ( self ) :
        tests = randint ( 1 , 4 )
        for test in range ( 1 , tests + 1 ) :
            print ( 'Case #%d:' % test , end = ' ' , file = sys.stderr )
            n = randint ( 1 , 4 )
            lst = [ randint ( 1 , 4 ) for _ in range ( n ) ]
            a = [ Item ( i , lst [ i ] , randint ( 1 , 4 ) ) for i in range ( n ) ]
            a.sort ( )
            for i in a :
                print ( ' ' , i.num , end = ' ' , file = sys.stderr )
            print ( file = sys.stderr )
class Item ( object ) :
    def __init__ ( self , n , l , p ) :
        self.num = n
        self.l = l
        self.p = p
    def __lt__ ( self , other ) :
        if self.p * self.l - self.p * self.l == 0 :
            return self.num - self.p * self.l
        return self.num - self.p * self.l
