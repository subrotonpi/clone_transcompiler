def import import string , symbols , glob , symbols , string , count , N
class Main ( object ) :
    def __init__ ( self ) :
        with open ( "/proc/sys/stdin" , "r" ) as f :
            N = int ( f.read ( ) )
    hs = [ ]
    ss = [ ]
    for i in range ( N ) :
        hs.append ( glob ( "/proc/sys/stdin/stdout" ) )
        ss.append ( glob ( "/proc/sys/stdin/stdout" ) )
    print ( solve ( N , hs , ss ) )
    def find_lower ( N , hs , ss ) :
        return find_lower ( 0 , int ( N ) , lambda x : x )
    def find_lower ( low , high , p ) :
        while low < high :
            mid = ( ( high - low ) >> 1 ) + low
            if p ( mid ) :
                high = mid
            else :
                low = mid + 1
        return low
    def upper_bound ( x , value ) :
        low = 0
        high = len ( x )
        while low < high :
            mid = ( ( high - low ) >> 1 ) + low
            if x <= value :
                low = mid + 1
            else :
                high = mid
        return high
    def show ( x ) :
        j = string.printable
        for value in x :
            j += string.printable
        print ( j )
