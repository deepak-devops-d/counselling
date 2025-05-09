# Generated by Django 3.2.25 on 2025-04-10 13:04

from django.db import migrations, models


class Migration(migrations.Migration):

    initial = True

    dependencies = [
    ]

    operations = [
        migrations.CreateModel(
            name='Appointment',
            fields=[
                ('id', models.BigAutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('name', models.CharField(max_length=100)),
                ('email', models.EmailField(max_length=254)),
                ('session_type', models.CharField(choices=[('individual', 'Individual'), ('group', 'Group'), ('family', 'Family')], max_length=20)),
                ('date', models.DateField()),
                ('time', models.TimeField()),
                ('notes', models.TextField(blank=True)),
            ],
        ),
    ]
