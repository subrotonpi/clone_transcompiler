def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.readline ( ).strip ( )
        po = [ ]
        sum = 0
        for i in range ( n ) :
            po.append ( sc.readline ( ).strip ( ) )
            sum += po [ i ]
        if sum % n == 0 :
            h = sum / n
            sum = 0
            count = 0
            count2 = 0
            for i in range ( n ) :
                sum += po [ i ]
                count2 += 1
                if sum == h * count2 :
                    sum = 0
                    count2 = 0
                else :
                    count += 1
            print ( count )
        else :
            print ( - 1 )
