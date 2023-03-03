def main ( ) :
    import sys
    sum = 0
    with open ( 'input.txt' , 'r' ) as f :
        n = f.read ( )
        m = n
        i = 100000000
        while True :
            if i <= m :
                m = m - i
                sum += 1
            else :
                if m == 0 :
                    break
                i = i / 10
        if n % sum == 0 :
            print ( 'Yes' )
        else :
            print ( 'No' )
