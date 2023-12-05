def import readline
import sys
from os.path import expanduser
from os import urandom
from os.environ import dict
from os.environ import dict
from os.environ import dict
from os.environ import dict
from os.chdir ( expanduser ( '~/.python/' ) )
class Main ( object ) :
    def __init__ ( self ) :
        super ( Main , self ).__init__ ( )
        self.k = sc.read ( )
        self.solve ( )
    def solve ( self ) :
        n = 50
        as = [ ]
        quotient , remainder = k / n , k % n
        for i in range ( n ) :
            as.append ( 49 + quotient )
        for i in range ( remainder ) :
            as [ i ] += n
            for j in range ( n ) :
                if i == j :
                    continue
                as [ j ] -= 1
        print ( n )
        for i in range ( n ) :
            print ( as [ i ] , end = '' )
            if i < n - 1 :
                print ( '' , end = '' )
            else :
                print ( )
class FastReader ( object ) :
    def readline ( self ) :
        while not isinstance ( self , bytes ) or not isinstance ( self , str ) :
            try :
                self.readline ( )
            except EOFError :
                pass
        return self
    def randint ( self ) :
        return int ( self.n )
    def long ( self ) :
        return long ( self.n )
    def uniform ( self ) :
        return uniform ( )
    def readline ( self ) :
        data = ''
        try :
            return readline ( self )
        except EOFError :
            pass
        return data
