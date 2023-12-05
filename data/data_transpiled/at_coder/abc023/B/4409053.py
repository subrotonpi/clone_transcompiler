def main ( args ) :
    import sys
    from string import ascii_letters
    sc = Scanner ( )
    n = sc.next ( )
    s = sc.next ( )
    ans = - 1
    if n % 2 == 1 :
        t = ""
        for i in range ( n ) :
            if i == 0 :
                t += "b"
            elif i % 3 == 1 :
                t = "a" + t + "c"
            elif i % 3 == 2 :
                t = "c" + t + "a"
            else :
                t = "b" + t + "b"
            if t == s :
                ans = i
                break
    print ( ans )
