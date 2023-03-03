def _import ( ) : return
import sys
import random
class Main ( object ) :
    def solve ( self , stream , ms ) :
        ms.YESNO ( stream , ms.isPalindrome ( stream.read ( 1 ) ) )
    def main ( self , args ) :
        main = Main ( )
        f = open ( '/dev/null' , 'w' )
        f = open ( '/dev/null' , 'w' )
        ms = methods.Methods ( )
        main.solve ( f , stream , ms )
        f.close ( )
    def __next__ ( self ) :
        try :
            stream.close ( )
        except :
            pass
        else :
            return - n if not PY3 else n
    def write ( self , * ar ) :
        self.write ( "\n".join ( map ( chr , ar ) ) )
    def yesno ( self , b ) :
        self.write ( "Yes" if b else "No" )
    def YESNO ( self , b ) :
        self.write ( "YES" if b else "NO" )
    def max ( self , * ar ) :
        self.write ( "\n".join ( map ( chr , ar ) ) )
    def min ( self , * ar ) :
        self.write ( "\n".join ( map ( chr , ar ) ) )
    def manhat ( self , x1 , y1 , x2 , y2 ) :
        d = abs ( x1 - x2 ) + abs ( y1 - y2 )
        return d
    def euclid ( self , x1 , y1 , x2 , y2 ) :
        d = math.sqrt ( ( x2 - x1 ) ** 2 + ( y2 - y1 ) ** 2 )
        return d
    def isPrime ( self , n ) :
        if n == 2 : return True
        else :
            if n < 2 or n % 2 == 0 : return False
            d = math.sqrt ( n )
            for i in range ( 3 , d + 1 , 2 ) :
                if n % i == 0 : return False
            return True
    def isPalindrome ( self , s ) :
        n = len ( s )
        for i in range (