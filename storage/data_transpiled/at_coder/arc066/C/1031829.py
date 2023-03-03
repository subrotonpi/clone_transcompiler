def import readline
from sys import stdin
from os.path import expanduser
from os.environ import environ
from os.name import next
from os.environ import environ
from os.chdir import chdir
class Main ( object ) :
    def solve ( self ) :
        n = randint ( 0 , 10000 )
        a = [ ]
        c = [ '+' ]
        for i in range ( n ) :
            if i > 0 :
                c.append ( next ( ) )
            a.append ( randint ( 0 , 10000 ) )
        s = ss = ans = 0
        for i in range ( n - 1 , - 1 , - 1 ) :
            if c [ i ] == '+' :
                s += a [ i ]
            else :
                ans = max ( - a [ i ] + s + ans , - a [ i ] - s + ss )
                ss += s + a [ i ]
                s = 0
        ans += s
        self.write ( ans )
    def readline ( self ) :
        while not self.readline ( ) or not self.readline ( ) :
            self.write ( "\n" )
        return self.readline ( )
    def readline ( self ) :
        return self.readline ( )
    def solve ( self ) :
        return solve ( )
