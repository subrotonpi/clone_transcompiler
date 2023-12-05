def import import sys , StringIO , subprocess , subprocess , stdin , stdout , stdin , stderr ) :
    import sys
    import stdin , stdout , stdin , stdin , stdout
    stdin = stdin
    stdout = stdout
    solver = task_b ( )
    solver.solve ( 1 , stdin , stdout )
    stdout.close ( )
class TaskB :
    def solve ( self , test_number , stdin , stdout ) :
        n = stdin.readline ( )
        l = stdin.readline ( ).rstrip ( )
        stdin.readline ( )
        amida = stdin.readline ( ).rstrip ( )
        pos = amida [ l ].find ( 'o' )
        for s in amida [ : l - 1 ] :
            if pos > 0 and s [ pos - 1 ] == '-' :
                pos -= 2
            elif pos < len ( s ) - 1 and s [ pos + 1 ] == '-' :
                pos += 2
        stdout.write ( '{}\n'.format ( pos // 2 + 1 ) )
