def _import ( ) : return sys.stdin.read ( )
import string
import tokenize
import tokenize
class Main ( object ) :
    def __init__ ( self , a ) :
        sc = sys.stdin.readline ( )
        N = sc.__next__ ( )
        A = sc.__next__ ( )
        print ( str ( a ) , end = '' )
    def print_single_line ( self ) :
        for i in range ( len ( self ) ) :
            if i != 0 : print ( '' , end = '' )
        print ( self.next ( ) , end = '' )
    def lower_bound ( self , value ) :
        low , high = 0 , len ( self )
        for i in range ( low , high ) :
            max = max ( a )
            low = mid + 1
        return low , high
    def upper_bound ( self , value ) :
        low , high = 0 , len ( self )
        for i in range ( low , high ) :
            mid = ( ( high - low ) >> 1 ) + low
            if a [ mid ] < value :
                low = mid + 1
            else :
                high = mid
        return low , high
    def lower_bound ( self , value ) :
        low , high = 0 , len ( self )
        for i in range ( low , high ) :
            if a [ i ] == value :
                low = mid
        return low , high
    def upper_bound ( self , value ) :
        low , high = 0 , len ( self )
        for i in range ( low , high ) :
            if a [ i ] == value :
                low = mid
            else :
                low = mid
        return low , high
    def readline ( self ) :
        if not self.next ( ) :
            return
        return self.next ( )
    def __next__ ( self ) :
        return int ( next ( ) )
    def __next__ ( self ) :
        return int ( next ( ) )
class Main ( object ) :
    def __init__ ( self , a ) :
        for i in range ( len ( self ) ) :
            a = a [ i ]
return Main
