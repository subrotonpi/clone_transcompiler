def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        arr1 = sc.readline ( ).split ( '+' )
        count = 0
        for s1 in arr1 :
            arr2 = s1.split ( '*' )
            zero = False
            for s2 in arr2 :
                if s2 == '0' :
                    zero = True
            if not zero :
                count += 1
        print ( count )
