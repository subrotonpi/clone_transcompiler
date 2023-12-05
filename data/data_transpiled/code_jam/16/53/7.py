def import time
import sys
import os
class Jumps ( object ) :
    class Point ( object ) :
        def __init__ ( self , x , y , z ) :
            self.x , self.y , self.z = x , y , z
        def dist ( self , other ) :
            dx , dy , dz = self.x - other.x , self.y - other.y , self.z - other.z
            return int ( self.x ) , int ( self.y ) , int ( self.y ) , int ( self.z )
        def dist ( self , other ) :
            return float ( self.x ) , float ( self.y ) , float ( self.z )
    def solve ( ) :
        n = sys.maxsize
        sys.maxsize = 0
        pts = [ ]
        for i in range ( n ) :
            pts.append ( Point ( sys.maxsize , sys.maxsize , sys.maxsize ) )
        dist = [ [ dist [ i ] for i in range ( n ) ] for j in range ( i + 1 , n ) ]
        l , r = 0 , 5000
        for IT in range ( 200 ) :
            mid = ( l + r ) / 2
            vis = [ False ] * n
            queue = [ ]
            head , tail = 0 , 0
            vis [ 0 ] = True
            queue.append ( 0 )
            while head < tail :
                cur = queue [ head ]
                head += 1
                for i in range ( n ) :
                    if not vis [ i ] and dist [ cur ] [ i ] < mid :
                        vis [ i ] = True
                        queue.append ( i )
            if vis [ 1 ] :
                r = mid
            else :
                l = mid
        print ( r , end = '' )
    def run ( ) :
        try :
            f = open ( 'input.txt' , 'r' )
            out = open ( 'output.txt' , 'w' )
            tests = f.read ( )
            for i in range ( 1 , tests + 1 ) :
                print ( 'Case #%d: ' % i , end = '' )
            print ( 'Solution #%d in %d ms\n'