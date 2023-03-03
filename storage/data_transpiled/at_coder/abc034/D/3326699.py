def _import ( ) : return int ( next ( ) )
def _import ( ) : return next ( )
def _import ( ) : return next ( )
def _import ( ) : return next ( )
def _import ( ) : return next ( )
def _import ( ) : return next ( )
def _import ( ) : return next ( )
def _import ( ) : return next ( )
def _import ( ) : return next ( )
def _import ( ) : return next ( )
def _import ( ) : return next ( )
def _import ( ) : return next ( )
def _import ( ) : return next ( )
def _import ( ) : return next ( )
def _import ( ) : return next ( )
def _import ( ) : return next ( )
def _import ( ) :
    sc = _FastScanner ( )
    N , K = sc.__next__ ( )
    W , P = [ _import ( ) for _ in range ( N ) ]
    print ( Decimal ( solve ( ) ).toPlainString ( ) )
    def _solve ( ) : return maximaize_d ( 0 , 100 , Main._import )
    def _calc ( p ) :
        reqs = [ ]
        for i in range ( N ) :
            actual , expected = float ( W [ i ] / 100 * P [ i ] ) , float ( W [ i ] / 100 * p )
            reqs.append ( expected - actual )
        reqs.sort ( )
        sum = 0.0
        for i in range ( K ) :
            sum += reqs [ i ]
        return sum <= 0.0
    def _maximaize_d ( lo , hi , p ) :
        time = 0
        while time < 100 :
            x = ( hi + lo ) / 2
            if p ( x ) :
                lo = x
            else :
                hi = x
        return lo
    from itertools import repeat
    for i in range ( N ) :
        if not i or not i :
            try :
                i = next ( )
            except StopIteration :
                break
        else :
            break
    return repeat ( )
