def import java.io.StringIO
import cStringIO
class AAA ( object ) :
    def getsum1 ( self , n , k ) :
        y = [ ]
        while 1 :
            if n in y : return False
            y.append ( n )
            res = 0
            while n != 0 :
                res += ( n % k ) ** 2
                n //= k
            n = res
            if n == 1 : return True
    result = defaultdict ( lambda : 0 )
    def solve ( ) :
        with open ( "input.txt" , "r" ) as infile , open ( "output.txt" , "w" ) as outfile :
            for t in range ( 1 , n + 1 ) :
                s = infile.readline ( )
                if not s : break
                a = [ ]
                with open ( s , "r" ) as in2 :
                    for line in in2 : a.append ( line )
            mask = 0
            for i in range ( len ( a ) ) : mask += 1 << a [ i ]
            if len ( a ) == 9 : result [ mask ] = 11814485
            tr = 2
            if mask in result :
                tr = result [ mask ]
            else :
                while 1 :
                    good = True
                    for i in range ( len ( a ) - 1 , - 1 , - 1 ) :
                        if not getsum1 ( tr , a [ i ] ) :
                            good = False
                            break
                        if good : break
                        tr += 1
                    result [ mask ] += tr
                outfile.write ( "Case #%d: %d\n" % ( t , tr ) )
                outfile.flush ( )
