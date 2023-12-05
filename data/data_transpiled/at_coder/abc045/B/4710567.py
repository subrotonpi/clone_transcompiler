def main ( ) :
    import sys
    from string import ascii_letters
    sc = Scanner ( )
    SA = sc.next ( )
    SB = sc.next ( )
    SC = sc.next ( )
    i , j , k = 0 , 0 , 0
    ans = ""
    tmp = SA [ i ]
    i += 1
    f = True
    while f :
        if tmp == "a" :
            if i == len ( SA ) :
                ans = "A"
                break
            tmp = SA [ i ]
            i += 1
        elif tmp == "b" :
            if j == len ( SB ) :
                ans = "B"
                break
            tmp = SB [ j ]
            j += 1
        elif tmp == "c" :
            if k == len ( SC ) :
                ans = "C"
                break
            tmp = SC [ k ]
            k += 1
    print ( ans )
