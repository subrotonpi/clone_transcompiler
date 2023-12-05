def main ( ) :
    import sys
    for x , y in enumerate ( range ( 10 ) ) :
        ans = 0
        ai = x
        while ai <= y :
            ai *= 2
            ans += 1
        print ( ans )
