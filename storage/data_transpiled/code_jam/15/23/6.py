def import _herb
class Herb ( object ) :
    def val ( self ) :
        groups = sc.randint ( 1 , 4 )
        start = [ ]
        size = [ ]
        period = [ ]
        total = 0
        for i in range ( groups ) :
            start.append ( sc.randint ( 0 , 4 ) )
            size.append ( sc.randint ( 0 , 4 ) )
            total += size [ i ]
            period.append ( sc.randint ( 0 , 4 ) )
        first = [ ]
        diff = [ ]
        def val ( self ) :
            j = 0
            for i in range ( groups ) :
                for k in range ( size [ i ] ) :
                    first.append ( ( self.period [ i ] + k ) * 2 ** ( 360 - start [ i ] ) )
                    diff.append ( 2 ** 360 * self.period [ i ] )
                    j += 1
        opt = total + 1
        for i in range ( total ) :
            crossings = 0
            for j in range ( total ) :
                if first [ i ] + 1 <= first [ j ] :
                    crossings += 1
                elif first [ i ] + 1 <= first [ j ] + diff [ j ] :
                    crossings += 0
                else :
                    crossings += ( first [ i ] + 1 - first [ j ] ) / diff [ j ]
            opt = min ( opt , crossings )
        return int ( opt )
    def main ( self ) :
        k = sc.randint ( 1 , 4 )
        for kk in range ( 1 , k + 1 ) :
            print ( "Case #%d: %s" % ( kk , val ( self ) ) )
    return Herb
