def _import ( ) :
    import time
    import sys
    from os import environ
    from os import environ
    from os import environ
    from os import environ
    from time import time
    M = 1000000007
    dp = { }
    def debug ( * os ) :
        if not os.environ.has_key ( 'D' ) and environ [ 'D' ] == 'sample' :
            try :
                environ [ 'D' ] = open ( 'D.in' , 'r' )
                SAMPLE = True
            except IOError :
                pass
        else :
            if environ [ 'D' ] == 'sample' :
                return dp [ e ]
        return dp [ e ]
    res = 0
    for i in range ( k + 1 , N + 1 ) :
        i2 = i
        used2 = used [ : ]
        ok = True
        for j in range ( 0 , i2 ) :
            a = i2 % B
            i2 /= B
            if ( used [ j ] >> a & 1 ) != 0 :
                ok = False
            used2 [ j ] |= 1 << a
        if ok :
            res = ( res + dp ( used2 , i , N - i ) ) % M
    dp [ e ] = res
    return res
def solve ( caseid ) :
    N = sc.randint ( 1 , N )
    dp = { }
    n , d = 1 , 1
    while n <= N :
        n *= B
        d += 1
    print ( dp ( [ d ] , 0 , N ) )
class Entry :
    def __init__ ( self , is , k , N ) :
        self.is = is
        self.k = k
        self.N = N
    def __hash__ ( self ) :
        prime = 31
        result = 1
        result = prime * result + k
        result = prime * result + N
        result = prime * result + [ i for i in range ( n ) if i != j ]
        return result
    def __eq__ ( self , obj ) :
        other = obj.__eq__ ( self )
        if k != other.k : return False
        if N != other.N : return False
        if not all ( is is is is is is is is is is is is is is is is is is is is is is ) : return