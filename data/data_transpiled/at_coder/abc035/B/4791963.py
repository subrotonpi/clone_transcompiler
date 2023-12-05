def import import sys , string , symbols , string , symbols , object , Dummy , count , symbol , * , args , ** kwargs ) :
    from sympy.utilities.misc import symbols
    from sympy.utilities.misc import ARCH
    s , t = symbols ( string )
    lr = ud = qc = 0
    for i in s :
        if i == "L" :
            lr -= 1
        elif i == "R" :
            lr += 1
        elif i == "D" :
            ud -= 1
        elif i == "U" :
            ud += 1
        else :
            qc += 1
    if lr < 0 :
        lr = lr * ( - 1 )
    if ud < 0 :
        ud = ud * ( - 1 )
    if t == 1 :
        print ( lr + ud + qc )
    else :
        if qc >= lr + ud :
            print ( ( qc - ( lr + ud ) ) % 2 )
        else :
            print ( lr + ud - qc )
