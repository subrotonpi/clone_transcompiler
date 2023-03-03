def world2014.qualification_round ( ) :
    import os
    import sys
    import os
    import os
    import sys
    class CookieClickerAlpha ( object ) :
        def solve ( C , F , X ) :
            cc = 2.0
            time = 0.0
            for _ in range ( 3 ) :
                t1 = X / cc
                t2 = C / cc + X / ( cc + F )
                if t1 < t2 :
                    return time , t1
                else :
                    time += C / cc
                    cc += F
            return time , t1
    input_path = 'file/world2014/qualification_round/B-large.in'
    output_filename = os.path.basename ( input_path ) + '.out'
    f = open ( input_path , 'r' )
    f.write ( output_filename )
    f.close ( )
    problem_num = int ( f.readline ( ) )
    for i in range ( problem_num ) :
        line = f.readline ( )
        splitted = line.split ( )
        C = float ( splitted [ 0 ] )
        F = float ( splitted [ 1 ] )
        X = float ( splitted [ 2 ] )
        res = CookieClickerAlpha ( ).solve ( C , F , X )
        lines = [ 'Case #%d: %f' % ( i + 1 , res ) ]
        print ( lines )
        f.write ( '\n'.join ( lines ) )
    f.close ( )
    os.remove ( output_filename )
