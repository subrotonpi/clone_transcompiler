def import import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import sys
class Main ( readline ) :
    taskname = "A-large"
    def solve ( ) :
        T = iread ( )
        for ntest in range ( 1 , T + 1 ) :
            N = iread ( )
            a = [ ]
            for s in readword ( ) :
                for j in range ( N ) : a.append ( s [ j ] - '0' )
        x = [ ]
        for i in range ( N ) :
            for j in range ( N ) :
                if a [ i ] [ j ] == 1 : x.append ( j )
        ans = 0
        for i in range ( N ) :
            t = - 1
            for j in range ( i , N ) :
                if x [ j ] <= i :
                    t = j
                    break
                ans += t - i
                m = x [ t ]
                for j in range ( t - 1 , i - 1 , - 1 ) : x [ j + 1 ] = x [ j ]
                x [ i ] = m
        sys.stdout.write ( "Case #%d: %d\n" % ( ntest , ans ) )
    def run ( ) :
        try :
            stdin = readline.stdin
            stdout = open ( taskname + ".in" , "r" )
            solve ( )
            stdout.flush ( )
        except :
            sys.stderr.write ( "Error running %d: %s\n" % ( taskname , sys.exc_info ( ) [ 0 ] ) )
            sys.exit ( 1 )
    def iread ( ) :
        return int ( readword ( ) )
    def dread ( ) :
        return float ( readword ( ) )
    def lread ( ) :
        return long ( readword ( ) )
    global stdout
    stdout = open ( taskname + ".out" , "w" )
    stdout.write ( "" )
    stdout.close ( )
