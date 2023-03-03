def main ( ) :
    import sys
    from string import ascii_letters
    with open ( 'input.txt' , 'r' ) as sc :
        S = sc.read ( )
    N = len ( S )
    current = N
    while current > 0 :
        if current >= 7 :
            sub = S [ current - 7 : current ]
            if sub == 'dreamer' :
                current -= 7
                continue
        if current >= 6 :
            sub = S [ current - 6 : current ]
            if sub == 'eraser' :
                current -= 6
                continue
        if current >= 5 :
            sub = S [ current - 5 : current ]
            if sub == 'dream' or sub == 'erase' :
                current -= 5
                continue
        print ( 'NO' )
        return
    print ( 'YES' )
