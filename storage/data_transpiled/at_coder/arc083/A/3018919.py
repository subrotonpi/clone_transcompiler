def _import ( ) : return _import ( )
import sys
class Main ( object ) :
    def REPS ( v ) : return sys.maxint
    def REPS ( l , r ) : return sys.maxint
    def INS ( n ) : return REPS ( n ) ( )
    def s ( ) : return sys.stdin.read ( )
    def getInt ( ) : return int ( s ( ) )
    def main ( ) :
        a , b , c , d , e , f = getInt ( )
        rw , rs = 100 * a , 0
        max = 0
        for i in range ( 0 , 100 ) :
            va = 100 * a * i
            if va > f : break
            for j in range ( 0 , 100 ) :
                vb = 100 * b * j
                if va + vb > f : break
                for k in range ( 0 , 100 ) :
                    vc = c * k
                    if va + vb + vc > f : break
                    for l in range ( 0 , 100 ) :
                        vd = d * l
                        if va + vb + vc + vd > f : break
                        if max < calc ( va + vb , vc + vd , e ) :
                            max = calc ( va + vb , vc + vd , e )
                            rw , rs = va + vb , vc + vd
        print ( rw , rs , rs )
    def calc ( w , s , e ) :
        r = 0 if w == 0 else 100.0 * s / ( w + s )
        return w / 100 * e < s
