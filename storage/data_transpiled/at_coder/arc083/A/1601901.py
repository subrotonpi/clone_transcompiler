def _import ( ) : return sys.stdin.read ( 2048 )
import io
import sys
import sys
class Main ( object ) :
    A , B , C , D , E , F = [ ] , [ ] , [ ] , [ ] , [ ] , [ ]
    def solve ( ) :
        A = randint ( 0 , 1 )
        B = randint ( 0 , 1 )
        C = randint ( 0 , 1 )
        D = randint ( 0 , 1 )
        E = randint ( 0 , 1 )
        F = randint ( 0 , 1 )
        a = [ ]
        b = [ ]
        for i in range ( 0 , 30 ) :
            for j in range ( 0 , 30 ) :
                k = i * A * 100 + j * B * 100
                if k > 0 and k <= F :
                    a.append ( True )
        for i in range ( 0 , 3000 ) :
            for j in range ( 0 , 3000 ) :
                k = i * C + j * D
                if k <= F :
                    b.append ( True )
        max = 0
        ansA = 100 * A
        ansB = 0
        for i in range ( 0 , 3000 ) :
            for j in range ( 0 , 3000 ) :
                if a [ i ] and b [ j ] and i + j <= F and i / 100 * E >= j :
                    k = 100.0 * j / ( i + j )
                    if k >= max :
                        max = k
                        ansA = i + j
                        ansB = j
        sys.stdout.write ( "%d %d\n" % ( ansA , ansB ) )
    def main ( ) :
        sys.stdout.flush ( )
        with open ( '/dev/null' , 'w' ) as f :
            f.write ( ''.join ( [ str ( p ) for p in range ( 0 , 200 ) ] ) )
