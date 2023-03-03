def main ( ) :
    import sys
    def solve ( ) :
        with open ( 'test.txt' , 'r' ) as f :
            k = f.read ( )
        a = 2
        b = 1
        if k == 1 :
            a = 1
            b = 1
        else :
            for i in range ( k - 1 ) :
                temp = a
                a = a + b
                b = temp
        print ( a , b )
    return solve
