def import main
class Main ( object ) :
    def __init__ ( self ) :
        self.p = 0
        with open ( "/proc/test/" , "r" ) as sc :
            N = sc.read ( )
    arr = Main.sieve ( 55555 )
    arr2 = [ ]
    for i in arr :
        if i % 5 == 1 :
            arr2.append ( i )
    for i in range ( N ) :
        print ( arr2 , end = " " )
    def sieve ( N ) :
        arr = [ 2 ]
        for i in range ( 3 , N ) :
            flag = True
            k = 0
            while flag and k < len ( arr ) :
                if i % arr [ k ] == 0 :
                    flag = False
                k += 1
            if flag :
                arr.append ( i )
        return arr
