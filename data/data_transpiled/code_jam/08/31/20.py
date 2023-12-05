def import java.io , os , sys
from subprocess import Popen , PIPE , STDOUT
class TaskA ( object ) :
    def __init__ ( self ) :
        self.f = open ( 'a.in' , 'r' )
        self.stk = [ ]
        self.f = open ( 'a.out' , 'w' )
        ( )
    def nline ( self ) :
        try :
            stk = shlex.split ( self.f.readline ( ) )
        except ValueError :
            pass
    def ni ( self ) :
        while not isinstance ( stk , int ) or not stk :
            nline ( self )
        return int ( stk )
    def nd ( self ) :
        while not isinstance ( stk , float ) or not stk :
            nline ( self )
        return float ( stk )
    def nl ( self ) :
        while not isinstance ( stk , long ) or not stk :
            nline ( self )
        return long ( stk )
    def solve ( self , tn ) :
        p , k , l = self.ni ( )
        s = [ ]
        for i in range ( l ) :
            s.append ( i )
        s.sort ( )
        ans = 0
        j = 1
        pp = 0
        for i in range ( l - 1 , - 1 , - 1 ) :
            ans += s [ i ] * j
            pp += 1
            if pp == k :
                pp = 0
                j += 1
        if p * k < l :
            sys.stdout.write ( 'Case #%s: impossible\n' % tn )
        else :
            sys.stdout.write ( 'Case #%s: %s\n' % ( tn , ans ) )
    def run ( self ) :
        n = self.ni ( )
        for i in range ( n ) :
            solve ( self , i + 1 )
        sys.stdout.close ( )
