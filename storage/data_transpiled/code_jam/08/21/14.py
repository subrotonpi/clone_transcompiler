def aditsu.gcj.croptriangles ( ) :
    import os
    import os.path
    import random
    import random
    import random
    import subprocess
    import subprocess
    import subprocess
    class CropTrianglesBig ( subprocess.Popen ) :
        def get_path ( self , * args ) :
            return 'src/%s: %d' % ( self.__package__ , r / 6 )
        def get_file ( self , file ) :
            return open ( self.__package__ , 'r' )
        def write ( self , file ) :
            return open ( self.__package__ , 'w' )
        def int_file ( self , s ) :
            return int ( s )
        def go ( self ) :
            f = get_file ( 'A-large.in' )
            w = open ( self.__package__ , 'w' )
            N = int_file ( f.readline ( ) )
            for i in range ( N ) :
                with open ( f.readline ( ) ) as sc :
                    n , a , b , c , d , x0 , y0 , m = sc.read ( )
                    count = [ [ 0 for _ in range ( 3 ) ] for _ in range ( 3 ) ]
                    x = x0
                    y = y0
                    for _ in range ( n ) :
                        count [ int ( x ) % 3 ] [ int ( y ) % 3 ] += 1
                        x = ( a * x + b ) % m
                        y = ( c * y + d ) % m
                r = 0
                for _ in range ( 9 ) :
                    x1 , y1 = divmod ( i1 , 3 )
                    for _ in range ( 9 ) :
                        r += random.randint ( 0 , 3 )
                for _ in range ( 3 ) :
                    r += random.randint ( 0 , 3 )
    return crop_TrianglesBig
