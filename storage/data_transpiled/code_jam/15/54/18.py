def world2015.round3 ( ) :
    import csv
    import csv
    import csv
    import csv
    import csv
    import csv
    class LogSet :
        def solve_for_small ( P , E , F ) :
            sum = 0
            for i in range ( P ) : sum += F [ i ]
            n = 0
            while sum > 1 :
                n += 1
                sum /= 2
            res = [ ]
            idx = 0
            fidx = 0
            F [ 0 ] -= 1
            for _ in range ( len ( F ) ) :
                while F [ fidx ] == 0 :
                    fidx += 1
                res.append ( E [ fidx ] )
                for s in range ( ( 1 << idx ) ) :
                    ss = res [ idx ]
                    for i in range ( idx ) :
                        if ( ( s >> i ) & 1 ) == 1 :
                            ss += res [ i ]
                    eidx = np.where ( E [ ss ] == 0 ) [ 0 ]
                    F [ eidx ] -= 1
                idx += 1
                if idx == n :
                    break
            return res
        def main ( args ) :
            input_path = 'file/world2015/round3/D-small-attempt0.in'
            output_path = input_path.split ( '.' ) [ 0 ] + '.out'
            f = csv.open ( input_path , 'w' )
            num_problems = randint ( 1 , len ( f ) )
            ls = LogSet ( )
            for i in range ( num_problems ) :
                P = randint ( 1 , len ( f ) )
                E = next_long_array ( f )
                F = next_long_array ( f )
                res = ls.solve_for_small ( P , E , F )
                lines = [ 'Case #%d:' % ( i + 1 ) for a in res ]
                print ( lines , file = f )
                f.writelines ( lines )
            f.close ( )
            return
    return LogSet ( )
