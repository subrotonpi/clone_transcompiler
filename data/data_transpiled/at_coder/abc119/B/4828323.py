def import import sys , StringIO , subprocess , subprocess , stdin , stdout , stdin , stderr ) :
    from io import StringIO
    from io import BytesIO
    from subprocess import Popen , PIPE , STDOUT
    stdin , stdout , stderr = stdin , stdout , stderr
    solver = TaskAtCoder19B ( )
    solver.solve ( 1 , stdin , stdout )
    stdout.close ( )
class TaskAtCoder19B ( subprocess ) :
    def solve ( self , test_number , stdin , stdout ) :
        N = len ( stdin )
        res = 0
        for i in range ( N ) :
            tmp = float ( stdin.readline ( ) )
            if stdin.readline ( ) == 'BTC' :
                tmp *= 380000.0
            res += tmp
        return res
