def main ( ) :
    import sys
    from string import ascii_letters
    from string import digits
    s = digits.letters
    t = digits.letters
    ans = "Yes"
    for i in range ( len ( s ) ) :
        if s.count ( s [ i ] , i + 1 ) != t.count ( t [ i ] , i + 1 ) :
            ans = "No"
            break
        print ( ans )
