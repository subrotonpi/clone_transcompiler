def _import ( ) :
    import os
    import sys
    class Main ( object ) :
        def __init__ ( self , stream ) :
            self.stream = stream
            self.stream = stream
            self.stream = stream
            self.stream = stream
        def readline ( self ) :
            while self.stream is None or not self.stream.readline ( ) :
                try :
                    self.stream = self.stream.readline ( )
                except IOError as exp :
                    raise
            return self.stream.readline ( )
        def readline ( self ) :
            return int ( self.stream.readline ( ) )
        def readline ( self ) :
            return long ( self.stream.readline ( ) )
    def main ( ) :
        input_file , output_file = sys.stdin , sys.stdout
        infile = InputReader ( input_file )
        outfile = open ( output_file , 'w' )
        new_task = Task ( )
        new_task.solve ( infile , outfile )
        outfile.close ( )
    class Task ( object ) :
        INF = sys.maxsize
        MOD = int ( 1e9 ) + 7
        cntCgtB = [ 0 ] * 100001
        def upper_bound ( self , arr , x ) :
            l = 0
            r = len ( self ) - 1
            while l <= r :
                mid = ( l + r ) >> 1
                if self.arr [ mid ] > x :
                    l = mid + 1
                else :
                    r = mid - 1
            return r + 1
        def solve ( self , infile , outfile ) :
            n = self.stream.tell ( )
            arr = [ ]
            for j in range ( 3 ) :
                for i in range ( n ) :
                    arr [ j ].append ( infile.read ( ) )
            arr = [ ]
            for i in range ( n ) :
                arr [ i ] = arr [ i ]
            arr [ 2 ].sort ( reverse = True )
            arr [ 1 ].sort ( reverse = True )
            cntCgtB.append ( cntCgtB [ i - 1 ] + upperBound ( arr [ 2 ] , arr [ 1 ] [ i ] ) )
        ans = 0
        for i in range ( n ) :
            ans += 1
    return