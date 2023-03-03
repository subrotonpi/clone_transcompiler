def import _main
import sys
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.ans = 0
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.randint ( 1 , 10000 )
        k = sc.randint ( 1 , 10000 )
        sum = [ ]
        for i in range ( 1 , n + 1 ) :
            sum.append ( sum [ i - 1 ] + sc.randint ( 1 , 10000 ) - k )
        temp = [ ]
        self.merge ( 0 , n , sum , temp )
        f = sys.stdout
        f.write ( ans )
        f.flush ( )
    def merge ( left , right , sum , temp ) :
        if left >= right :
            return
        mid = ( left + right ) // 2
        self.merge ( left , mid , sum , temp )
        self.merge ( mid + 1 , right , sum , temp )
        start = mid + 1
        for i in range ( left , mid + 1 ) :
            while start <= right and sum [ start ] - sum [ i ] < 0 :
                start += 1
            self.ans += right + 1 - start
        k , i , j = left , left , mid + 1
        while i <= mid and j <= right :
            if sum [ i ] < sum [ j ] :
                temp [ k ] += sum [ i ]
                i += 1
            else :
                temp [ k ] += sum [ j ]
                j += 1
        while i <= mid :
            temp [ k ] += sum [ i ]
            i += 1
        while j <= right :
            temp [ k ] += sum [ j ]
            j += 1
        for m in range ( left , right + 1 ) :
            sum [ m ] = temp [ m ]
