def import stream , nval
import csv
import stream
import csv
class Main ( stream ) :
    def __next__ ( self ) :
        f = csv.reader ( open ( self.name + '.out' , 'w' ) )
        return next ( f )
    def __next__ ( self ) :
        f.next = lambda self : next ( self )
        return next ( f )
class Main ( stream ) :
    NAME = 'c'
    def __init__ ( self ) :
        stream = csv.writer ( open ( self.name + '.in' , 'w' ) )
        self.reader = csv.reader ( open ( self.name + '.in' , 'r' ) )
        self.tests = int ( next ( ) )
        n = 1000005
        p = [ ]
        pr = [ True ] * n
        ind = 0
        for i in range ( 2 , n ) :
            if pr [ i ] :
                p.append ( i )
                for j in range ( 2 * i , n , i ) :
                    pr [ j ] = False
        for test in range ( 1 , tests + 1 ) :
            k = next ( stream )
            if k == 1 :
                stream.writerow ( [ 'Case #%d: 0' % test ] )
                continue
            answ = 1
            for i in range ( ind ) and p [ i ] <= k :
                t = 1
                answ -= 1
                while t * p [ i ] <= k :
                    t *= p [ i ]
                    answ += 1
            stream.writerow ( [ 'Case #%d: %d' % ( test , answ ) ] )
