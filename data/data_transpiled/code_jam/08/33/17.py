def import _task_c
import os
import sys
import subprocess
class TaskC ( subprocess.Popen ) :
    def __init__ ( self ) :
        self.stdin = open ( 'c.in' )
        self.stdout = open ( 'c.out' )
        ( subprocess.Popen.run ( self.stdin , stdout = subprocess.PIPE ) ).communicate ( )
    def nline ( self ) :
        try :
            stk = shlex.split ( self.stdin.readline ( ) )
        except ValueError :
            pass
    def ni ( self ) :
        while not stk or not stk [ 0 ] :
            self.nline ( )
        return int ( stk [ 0 ] )
    def nd ( self ) :
        while not stk or not stk [ 0 ] :
            self.nline ( )
        return float ( stk [ 0 ] )
    def nl ( self ) :
        while not stk or not stk [ 0 ] :
            self.nline ( )
        return long ( stk [ 0 ] )
    magic = 1000000007L
    def solve ( self , tn ) :
        n , m = self.ni ( )
        x , y , z = self.ni ( )
        mm = [ ]
        for i in range ( m ) :
            mm.append ( self.ni ( ) )
        a = [ ]
        for i in range ( n ) :
            a.append ( mm [ i % m ] )
            mm [ i % m ] = ( x * mm [ i % m ] + y * ( i + 1 ) ) % z
        aa = [ ]
        for i in range ( n ) :
            k = 1
            for j in range ( i ) :
                if a [ j ] < a [ i ] :
                    k = ( k + aa [ j ] ) % magic
                aa.append ( k )
        ans = 0
        for i in range ( n ) :
            ans = ( ans + aa [ i ] ) % magic
        print ( 'Case #%d: %d' % ( tn , ans ) )
