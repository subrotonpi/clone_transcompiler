def con2014Q ( ) :
    import os
    import sys
    import os
    import sys
    class B ( object ) :
        islarge = '-large'
    fname = os.path.join ( os.path.dirname ( __file__ ) , 'results/con2014Q/' + B.__name__.lower ( ) + islarge )
    input_fname = fname + '.in'
    output_fname = fname + '.out'
    def solve ( ) :
        C , F , X = [ float ( x ) for x in sys.stdin.readline ( ).split ( ',' ) ]
        best = X / 2
        cur = 0
        a_farms = 0
        while cur < best :
            cur += C / ( 2 + ( a_farms * F ) )
            a_farms += 1
            best = min ( best , cur + ( X / ( 2 + ( a_farms * F ) ) ) )
        return '%.7f%%' % best
    def main ( ) :
        locale.setlocale ( locale.LC_ALL , '' )
        start = time.time ( )
        infile = open ( input_fname , 'r' )
        outfile = open ( output_fname , 'w' )
        tests = infile.readline ( ).split ( '\n' )
        infile.readline ( )
        for t in range ( 1 , tests + 1 ) :
            outfile.write ( 'Case #%d: ' % t )
            B ( ).solve ( )
            print ( 'Case #%d: solved' % t )
        infile.close ( )
        outfile.close ( )
        stop = time.time ( )
        print ( '%.7f ms' % ( stop - start ) )
    return main
