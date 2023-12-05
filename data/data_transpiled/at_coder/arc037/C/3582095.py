def py2pipe ( ) : return int ( next ( ) )
def next_int ( n ) : return int ( next ( ) )
def next_int ( n ) : return int ( next ( ) )
def next_long ( n ) : return long ( next ( ) )
def main ( ) : return 1
def main ( ) : return 1
def main ( ) : return 1
def main ( ) : return 1
def main ( ) : return 1
def main ( ) : return 1
def main ( ) : return 1
def main ( ) : return 1
def main ( ) : return 1
def main ( ) : return 1
def main ( ) : return 1
def main ( ) : return 1
def main ( ) : return 1
def main ( ) : return 1
def main ( ) : return 1
def main ( ) : return 1
def main ( ) : return 1
def main ( ) : return 1
def main ( ) : return 1
def main ( ) : return 1
def main ( ) : return 1
def calc ( x ) :
def calc ( x ) :
    sum = 0
    for i in range ( N ) :
        a = A [ i ]
        sum += upperBound ( B , x / a )
    return sum >= K
def upperBound ( x , value ) :
    low = 0
    high = len ( x )
    while low < high :
        mid = ( ( high - low ) >> 1 ) + low
        if x <= value :
            low = mid + 1
        else :
            high = mid
    return low
def minimize ( lo , hi , p ) :
    while lo < hi :
        x = ( ( hi - lo ) >> 1 ) + lo
        if p ( x ) :
            hi = x
        else :
            lo = x + 1
    return lo
from py2pipe import FastScanner
def readline ( ) :
    return next ( )
def __next__ ( ) : return int ( next ( ) )
def readline ( ) :
    if not next ( ) or not next ( ) :
        try :
            next ( )
        except StopIteration :
            next ( )
        return next ( )
return __next__
