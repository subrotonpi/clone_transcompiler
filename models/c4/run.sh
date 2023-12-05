output=test 
lr=5e-5
batch_size=4
source_length=512
data_dir=~/PycharmProjects/code-clone-multilingual/storage/dataset_small/c4 #alternative/c4
output_dir=model/$output
train_file=$data_dir/train.csv
dev_file=$data_dir/dev.csv
test_file=$data_dir/test.csv
epochs=10
pretrained_model=microsoft/codebert-base #Roberta: roberta-base 

c=~/PycharmProjects/code-clone-multilingual/experimental/C4/model_alt_large
saved_model=$c/test/checkpoint-best-ppl/pytorch_model.bin

python3 run_con.py --do_train --do_eval  --do_test --model_type roberta --model_name_or_path $pretrained_model --train_filename $train_file --dev_filename $dev_file --output_dir $output_dir --max_source_length $source_length --train_batch_size $batch_size --eval_batch_size $batch_size --learning_rate $lr --num_train_epochs $epochs --test_filename $test_file #--load_model_path $saved_model