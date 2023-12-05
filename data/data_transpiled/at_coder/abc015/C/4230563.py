def main ( ) :
    import math
    from random import randint
    from math import pow
    from random import randint
    from math import pow
    from random import choice
    from random import choice
    nums = [ choice ( range ( randint ( 1 , 5 ) ) ) for _ in range ( choice ( range ( 1 , 5 ) ) ) ]
    place = [ choice ( range ( len ( nums ) ) ) for _ in range ( choice ( range ( 0 , 1 ) ) ) ]
    tmp = 0
    for i in range ( pow ( len ( nums [ 0 ] ) , len ( nums ) ) ) :
        for j in range ( len ( nums ) ) :
            if j == 0 :
                tmp = nums [ 0 ] [ place [ 0 ] ]
            else :
                tmp = tmp ^ nums [ j ] [ place [ j ] ]
        if tmp == 0 :
            print ( "Found" )
            return
        place [ 0 ] += 1
        for j in range ( len ( place ) - 1 ) :
            if place [ j ] >= len ( nums [ 0 ] ) :
                place [ j ] = 0
                place [ j + 1 ] += 1
    print ( "Nothing" )
