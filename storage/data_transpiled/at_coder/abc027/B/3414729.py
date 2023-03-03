def import _Point
import sys
import os
import sys
class Main ( object ) :
    @ classmethod
    def setUpClass ( cls ) :
        sys.stdin.close ( )
        sys.stdin.close ( )
        sys.stdin.close ( )
        n = sys.stdin.readline ( ).rstrip ( '\n' )
        a = [ ]
        seen = set ( )
        sum = 0
        for i in range ( n ) :
            a.append ( sys.stdin.readline ( ) )
            sum += a [ i ]
        if sum % n != 0 :
            print ( - 1 )
            return
        ave = sum // n
        for i in range ( n - 1 ) :
            if a [ i ] == ave :
                continue
            a [ i + 1 ] += a [ i ] - ave
            a.append ( ave )
            seen.add ( ( i , i + 1 ) )
        print ( len ( seen ) )
class Point ( object ) :
    def __init__ ( self , x , y ) :
        self.x = x
        self.y = y
    def __hash__ ( self ) :
        import random
        return random.randint ( 0 , 1 )
    def __eq__ ( self , other ) :
        if self == other : return True
        if not self.x : return False
        if self.y != other.y : return False
        other = self.x
        if self.x != other.x : return False
        if self.y != other.y : return False
        return True
