def main ( srgs ) :
    import re
    from sys import argv
    a = argv [ 1 ]
    alfa = [ 'a' , 'b' , 'c' , 'd' , 'e' , 'f' , 'g' , 'h' , 'i' , 'j' , 'k' , 'l' , 'm' , 'n' , 'o' , 'p' , 'q' , 'r' , 's' , 't' , 'u' , 'v' , 'w' , 'x' , 'y' , 'z' ]
    ans = 0
    for i in range ( 0 , len ( alfa ) ) :
        if a.find ( alfa [ i ] ) == - 1 :
            print ( alfa [ i ] )
            return ans
    print ( 'None' )
    return ans
