def _import ( ) : return int ( raw_input ( ) )
import sys
import random
import time
import sys
class Main ( ) :
    def __init__ ( self ) :
        self.N , self.K = random.randint ( 1 , 10000 )
        self.X = random.randint ( 1 , 10000 )
        self.ans = solve ( )
        f = sys.stdout
        for i in ans :
            f.write ( i )
        f.flush ( )
    def solve ( self ) :
        H = [ ]
        for i in range ( self.N ) :
            H.append ( Human ( i + 1 , self.X [ i ] ) )
        q = sorted ( sorted ( [ h.x for h in H ] ) , key = lambda h : - h.x )
        ans = [ ]
        ans.append ( q [ - 1 ].i )
        for i in range ( 1 , N - K + 1 ) :
            q.append ( H [ i + K - 1 ] )
            q.pop ( )
            ans.append ( q [ - 1 ].i )
        return ans
class Human ( ) :
    def __init__ ( self , i , x ) :
        self.i , self.x = i , x
    @ staticmethod
    def readline ( ) :
        if not isinstance ( readline , str ) or not readline.startswith ( '\n' ) :
            try :
                readline = raw_input ( )
            except EOFError :
                readline = raw_input ( )
        return readline ( )
    def readline ( ) :
        if not isinstance ( readline , str ) or not readline.startswith ( '\n' ) :
            try :
                readline = raw_input ( )
            except EOFError :
                readline = raw_input ( )
            return readline ( )
        return readline ( )
