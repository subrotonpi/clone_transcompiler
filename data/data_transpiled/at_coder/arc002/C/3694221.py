def main ( * argv ) :
    import os
    from sys import argv
    n = len ( argv )
    command = argv [ 1 ]
    keywords = [ 'AA' , 'AB' , 'AX' , 'AY' , 'BA' , 'BB' , 'BX' , 'BY' , 'XA' , 'XB' , 'XX' , 'XY' , 'YA' , 'YB' , 'YX' , 'YY' ]
    ans = len ( command )
    for i in range ( len ( keywords ) - 1 ) :
        for j in range ( i , len ( keywords ) ) :
            count = 0
            temp_ans = n
            while count < n - 1 :
                sub_str = command [ count : count + 2 ]
                if sub_str == keywords [ i ] or sub_str == keywords [ j ] :
                    temp_ans -= 1
                    count += 2
                else :
                    count += 1
            ans = min ( ans , temp_ans )
    print ( ans )
