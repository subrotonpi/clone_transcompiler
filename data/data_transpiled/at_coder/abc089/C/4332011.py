def Main ( ) :
    global n
    m , a , r , c , h = 0 , 0 , 0 , 0 , 0
    for i in range ( n ) :
        if i == 'M' :
            m += 1
            continue
        elif i == 'A' :
            a += 1
            continue
        elif i == 'R' :
            r += 1
            continue
        elif i == 'C' :
            c += 1
            continue
        elif i == 'H' :
            h += 1
    print ( m * a * r + m * a * c + m * a * h + m * r * c + m * r * h + m * c * h + a * r * c + a * r * h + a * c * h + r * c * h )
